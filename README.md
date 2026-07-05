    ███████╗██╗███████╗███████╗██████╗ ██╗   ██╗███████╗███████╗
    ██╔════╝██║╚══███╔╝╚══███╔╝██╔══██╗██║   ██║╚══███╔╝╚══███╔╝
    █████╗  ██║  ███╔╝   ███╔╝ ██████╔╝██║   ██║  ███╔╝   ███╔╝
    ██╔══╝  ██║ ███╔╝   ███╔╝  ██╔══██╗██║   ██║ ███╔╝   ███╔╝
    ██║     ██║███████╗███████╗██████╔╝╚██████╔╝███████╗███████╗
    ╚═╝     ╚═╝╚══════╝╚══════╝╚═════╝  ╚═════╝ ╚══════╝╚══════╝

                           ██╗ █████╗ ██╗   ██╗ █████╗
                           ██║██╔══██╗██║   ██║██╔══██╗
                           ██║███████║██║   ██║███████║
                      ██╗  ██║██╔══██║╚██╗ ██╔╝██╔══██║
                      ╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║
                       ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝


FizzBuzz is one of the most popular programming logic challenges used in technical interviews. Based on a classic children's game, the challenge consists of writing a program that prints the numbers from **1 to 100**, replacing multiples of **3** with **"Fizz"**, multiples of **5** with **"Buzz"**, and multiples of **both 3 and 5** with **"FizzBuzz"**.

This exercise is designed to help you understand the logical flow and structure behind this classic programming problem.

## Understanding the Challenge

The primary goal of FizzBuzz is not to test advanced programming knowledge, but to evaluate fundamental problem-solving skills and the correct use of:

- Conditional statements (`if` / `else`)
- The modulus (remainder) operator (`%`)
- Basic iteration (loops)

### Rules

For each number in the sequence:

1. If the number is divisible by **both 3 and 5**, print **`FizzBuzz`**.
2. If the number is divisible **only by 3**, print **`Fizz`**.
3. If the number is divisible **only by 5**, print **`Buzz`**.
4. Otherwise, print the number itself.

### Example Output

```text
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
...
```