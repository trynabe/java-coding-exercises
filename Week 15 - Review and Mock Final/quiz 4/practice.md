# 📚 Java Exercises

## 🧩 ข้อ 1: ระบบบันทึกข้อมูลนักเรียน (File Output)

### 📌 คำอธิบาย

เขียนโปรแกรมเพื่อเก็บข้อมูลนักเรียน 3 คน (ชื่อ + คะแนนสอบ) ลงไฟล์ `students.txt`

### 🏗️ คลาสที่ต้องเขียน

* `Student` → เก็บข้อมูลชื่อและคะแนน
* `StudentManager` → ดูแลการจัดการ student และการเขียนไฟล์

### ⚙️ ข้อกำหนด

* ข้อมูลในไฟล์:

```
ชื่อ: <ชื่อ>, คะแนน: <คะแนน>
```

* ใช้ `BufferedWriter` เขียนไฟล์

### 📄 ตัวอย่าง Output (students.txt)

```
ชื่อ: Alice, คะแนน: 78
ชื่อ: Bob, คะแนน: 82
ชื่อ: Charlie, คะแนน: 91
```

---

## 🧩 ข้อ 2: ระบบจัดการสินค้าในสต็อก (File Input + Count + Exception)

### 📌 คำอธิบาย

อ่านไฟล์ `stock.txt` ซึ่งเก็บชื่อสินค้าบรรทัดละ 1 รายการ แล้วแสดงชื่อและนับจำนวน

### 🏗️ คลาสที่ต้องเขียน

* `ProductReader` → อ่านไฟล์สินค้า
* `ProductManager` → ควบคุมการนับและแสดงผล

### ⚙️ ข้อกำหนด

* ถ้าไฟล์ไม่มี → แสดง:

```
ไม่พบไฟล์สินค้า
```

### 📄 ตัวอย่างไฟล์ (stock.txt)

```
Keyboard
Mouse
Monitor
Webcam
```

### 📊 Output

```
รายการสินค้า:
Keyboard
Mouse
Monitor
Webcam
จำนวนสินค้าทั้งหมด: 4 ชิ้น
```

---

## 🧩 ข้อ 3: ระบบนับคำที่ไม่ซ้ำ (Set + Split String)

### 📌 คำอธิบาย

รับ String แล้วแยกคำด้วย space จากนั้นเก็บลง `Set<String>` เพื่อกรองคำซ้ำ

### 🏗️ คลาสที่ต้องเขียน

* `WordCounter` → ประมวลผลข้อความและเก็บคำไม่ซ้ำ
* `Main` → จำลองข้อความ input และเรียกใช้งาน

### 📥 Input

```java
String text = "hello world hello java set map java";
```

### 📊 Output

```
คำที่ไม่ซ้ำทั้งหมด: 5 คำ
คำที่พบ:
hello
world
java
set
map
```

---

## 🧩 ข้อ 4: นับจำนวนตัวอักษรใน String (Recursion)

### 📌 คำอธิบาย

เขียนเมธอด `countChar(String str, char ch)`
เพื่อคืนค่าจำนวนครั้งที่ตัวอักษร `ch` ปรากฏใน `str`

### ⚙️ ข้อกำหนด

* ใช้ recursion เท่านั้น
* ห้ามใช้ loop
* เปรียบเทียบจากซ้ายไปขวา

### 📊 ตัวอย่าง

```java
System.out.println(countChar("banana", 'a')); // 3
System.out.println(countChar("hello", 'l'));  // 2
System.out.println(countChar("java", 'x'));   // 0
```

---

## 🧩 ข้อ 5: Reverse String ด้วย Recursion

### 📌 คำอธิบาย

เขียนเมธอด `reverse(String s)`
เพื่อคืนค่าข้อความกลับด้าน

### ⚙️ ข้อกำหนด

* ใช้ recursion เท่านั้น
* ห้ามใช้ loop (for, while, etc.)
* ห้ามใช้ `StringBuilder`
* ห้ามใช้ method `reverse()`

### 📊 ตัวอย่าง

```java
System.out.println(reverse("hello"));   // "olleh"
System.out.println(reverse("Java123")); // "321avaJ"
```

---
