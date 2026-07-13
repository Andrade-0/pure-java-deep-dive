## Learning: `Writer`, `PrintWriter`, and `OutputStream`

In this section, I explored the difference between Java's **character-based I/O** (`Reader`/`Writer`) and **byte-based I/O** (`InputStream`/`OutputStream`).

### `Writer` and `PrintWriter`

* `Writer` is the base class for writing **characters (text)**.
* `PrintWriter` extends `Writer` and provides convenient methods such as `print()`, `println()`, and `printf()`.
* It is ideal for creating and writing text files (`.txt`, `.csv`, `.log`, etc.) because it handles the conversion from characters to bytes internally.

Example:

```java
PrintWriter writer = new PrintWriter("users.txt");
writer.println("John");
writer.println("Alice");
writer.close();
```

### `OutputStream` and `FileOutputStream`

* `OutputStream` is the base class for writing **raw bytes**.
* `FileOutputStream` writes bytes directly to a file and is commonly used for binary data such as images, PDFs, videos, or any other non-text files.
* When writing text with a `FileOutputStream`, the text must first be converted into bytes.

Example:

```java
FileOutputStream fos = new FileOutputStream("file.txt");
fos.write("Hello".getBytes(StandardCharsets.UTF_8));
fos.close();
```

### Key Difference

| `Writer`                                 | `OutputStream`                               |
| ---------------------------------------- | -------------------------------------------- |
| Works with **characters (text)**         | Works with **bytes (binary data)**           |
| Best for text files                      | Best for binary files                        |
| Handles character encoding automatically | Requires manual conversion when writing text |

### Important Takeaway

Although text files are ultimately stored as bytes on disk, `Writer` classes hide the encoding process, making them easier and safer for text manipulation. In contrast, `OutputStream` classes operate directly on raw bytes, providing greater flexibility for binary data.
