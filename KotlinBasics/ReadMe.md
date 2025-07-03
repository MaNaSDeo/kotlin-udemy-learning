# Kotlin Basics - Lecture 2 Summary

This repo contains Kotlin practice files from Lecture 2. Below is a quick overview of concepts covered in each file.

---

### ✅ Key Concepts Covered

- **Variables**
    - `val` is immutable (like `const` in JS).
    - `var` is mutable and can be reassigned.
    - Kotlin supports strong typing: `Byte`, `Int`, `Float`, `Double`, `UShort`, etc.

- **Floating Point Types**
    - Default decimal = `Double`, append `f` for `Float`.
    - Precision differences shown with `3.1415926535f` vs `Double`.

- **Boolean Logic**
    - Usage of `true`, `false`, `null`.
    - Operators: `||`, `&&`, `!`

- **Characters & Unicode**
    - Char usage like `'a'`, escape characters (`\\`, `\n`), and Unicode codes (`\u092E`).

- **Strings**
    - Concatenation, interpolation (`$var`), string functions like `uppercase()`, `length`, etc.

- **Conditionals & Ranges**
    - `if-else` blocks with range checks using `in 18..100`.
    - Basic user input handling with `readln()` and `.toInt()`.

---

### 📁 Files Overview

- **Basic.kt**: Covers data types, string operations, and age-based voting logic.
- **AgeControl.kt**: Club entry condition based on age using ranges.
- **BooleanPractice.kt**: Demonstrates logical operators.
- **FloatingTypes.kt**: Difference between `Double` and `Float` with precision checks.
- **VariablesType.kt**: Mutable and immutable variables, reassignment demo.

---

> 💡 Tip: Always match your variable's data type with the value you're assigning. Kotlin is strictly typed and will throw errors otherwise.

