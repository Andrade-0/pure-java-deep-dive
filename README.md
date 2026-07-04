# java.util.Arrays — Reference Guide

Utility class in `java.util` (since Java 1.2) providing static methods for manipulating arrays: sorting, searching, comparing, filling, copying, and converting to other structures. All methods throw `NullPointerException` if the passed array is `null`, except where noted.

---

## 1. Sorting (`sort`)

| Method | Description |
|---|---|
| `sort(int[] a)` / `sort(long[] a)` / `sort(short[] a)` / `sort(char[] a)` / `sort(byte[] a)` | Sorts the primitive array into ascending order. Internally uses a **Dual-Pivot Quicksort**, generally faster than traditional single-pivot quicksort implementations. |
| `sort(float[] a)` / `sort(double[] a)` | Same as above, but with special handling for `NaN` and zero: `NaN` is treated as greater than any other value, and `-0.0` is treated as less than `0.0` (unlike the `==` operator). |
| `sort(a, fromIndex, toIndex)` | Variant that sorts only the range `[fromIndex, toIndex)`. |
| `sort(Object[] a)` | Sorts according to natural ordering (elements must implement `Comparable`). Uses a stable implementation based on **TimSort** (adaptive mergesort). |
| `sort(T[] a, Comparator<? super T> c)` | Sorts according to a custom `Comparator`. Also stable. |

**Common exceptions:** `IllegalArgumentException` (if `fromIndex > toIndex`), `ArrayIndexOutOfBoundsException` (indices out of range), `ClassCastException` (elements not mutually comparable).

## 2. Parallel Sorting (`parallelSort`) — since Java 8

Same idea as `sort`, but splits the array into sub-arrays, sorts each one (falling back to sequential `sort` once a sub-array is small enough), then merges them in parallel using the **ForkJoin common pool**. Overloads exist for all primitive types and for `Object[]`/`T[]` (with or without `Comparator`, with or without a `fromIndex`/`toIndex` range). Worth it for large arrays; for small arrays the overhead isn't worth it.

## 3. Binary Search (`binarySearch`)

Searches for a value in an **already sorted** array. If the array isn't sorted, the result is undefined.

- Overloads for all primitive types, for `Object[]` (natural order), and for `T[]` with a `Comparator`.
- All have a variant with `fromIndex`/`toIndex` to restrict the search to a range.
- **Return value:** the index of the element if found; otherwise `-(insertion point) - 1`, where the insertion point is the index at which the value would be inserted to keep the array sorted. This guarantees the return value is `>= 0` if and only if the key was found.
- If there are multiple equal elements, there's no guarantee which index is returned.

## 4. Comparison (`equals` and `deepEquals`)

- `equals(a1, a2)`: compares arrays of the same type element by element (same length, same values in the same order). Two `null` arrays are considered equal.
- For `double`/`float`, uses the semantics of `Double.equals`/`Float.equals`: `NaN == NaN` is `true` and `0.0 != -0.0` (unlike the `==` operator).
- `deepEquals(Object[] a1, Object[] a2)`: like `equals`, but recursively compares nested arrays (arrays within arrays) at any depth. **Caution:** should not be used on arrays that contain themselves as elements (undefined behavior).

## 5. Filling (`fill`)

Assigns a value to every element of an array (or to a range `[fromIndex, toIndex)`). There's a version for each primitive type and one for `Object[]` (which throws `ArrayStoreException` if the value isn't compatible with the array's runtime type).

## 6. Copying (`copyOf` and `copyOfRange`)

- `copyOf(original, newLength)`: creates a copy of the array with the given length. If `newLength` is greater, the extra elements are padded with the type's "zero" value (`0`, `false`, `null`, null character, etc.). If smaller, the array is truncated.
- `copyOf(original, newLength, newType)`: same idea, but lets you specify the resulting array's class (useful with `Object` arrays).
- `copyOfRange(original, from, to)`: copies a specific range `[from, to)`. If `to` exceeds the original length, the remainder is padded with default values.
- Throws `NegativeArraySizeException` if the requested length is negative, and `ArrayIndexOutOfBoundsException`/`IllegalArgumentException` on invalid indices.

## 7. Hashing and String Representation

- `hashCode(a)`: generates a hash based on the array's contents (equivalent to the hash of a `List` containing the same elements). For `Object[]`, nested arrays are hashed by identity, not content.
- `deepHashCode(Object[] a)`: like `hashCode`, but recurses into nested arrays.
- `toString(a)`: returns a representation like `"[1, 2, 3]"`. For `Object[]`, nested arrays show up by their identity (not their content).
- `deepToString(Object[] a)`: recursive version, ideal for multidimensional arrays — shows the actual contents of nested arrays, with protection against self-reference (renders as `[...]`).

## 8. Conversion to List (`asList`)

```java
List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
```

Returns a **fixed-size** list backed by the array itself — changes to the list are reflected in the array and vice versa. Elements can't be added or removed (throws `UnsupportedOperationException`), but `set()` works.

## 9. Generating Elements (`setAll` / `parallelSetAll`) — since Java 8

Fills each array position using a generator function that receives the index and returns the value:

```java
int[] squares = new int[10];
Arrays.setAll(squares, i -> i * i);
```

`parallelSetAll` does the same in parallel — useful for large arrays.

## 10. Parallel Prefix Sum (`parallelPrefix`) — since Java 8

Applies an associative binary operation cumulatively, in parallel. Example: array `[2, 1, 0, 3]` with addition becomes `[2, 3, 3, 6]`. For `double`, the result may differ slightly from a sequential run due to floating-point operations not being strictly associative.

## 11. Streams and Spliterators — since Java 8

- `stream(array)`: creates a sequential `Stream<T>`, `IntStream`, `LongStream`, or `DoubleStream` from the array (or a range of it).
- `spliterator(array)`: returns a `Spliterator` (or the `OfInt`/`OfLong`/`OfDouble` variants) reporting `SIZED`, `SUBSIZED`, `ORDERED`, and `IMMUTABLE`, used internally by streams and other APIs.

---

## Quick Reference — What to Use When

| I need to... | Method |
|---|---|
| Sort an array | `sort` |
| Sort fast on a large array (multi-core) | `parallelSort` |
| Search a value in a sorted array | `binarySearch` |
| Compare two arrays | `equals` / `deepEquals` |
| Fill an entire array with a value | `fill` |
| Resize/copy an array | `copyOf` / `copyOfRange` |
| Print/debug array contents | `toString` / `deepToString` |
| Treat an array as a `List` | `asList` |
| Generate values by index | `setAll` / `parallelSetAll` |
| Parallel cumulative sum | `parallelPrefix` |
| Use with the Stream API | `stream` |

---

*Source: Oracle's official Java SE 8 documentation (`java.util.Arrays`). Content reorganized and rewritten in guide format — consult the official Oracle documentation for the full details of every method signature and exception.*