# Student Analyzer – Java & JUnit Testing

## 1. Giới thiệu bài toán

Bài tập nhằm mục tiêu thực hành:
- Viết chương trình Java xử lý dữ liệu
- Áp dụng kiểm thử đơn vị (Unit Test) với JUnit 5
- Rèn luyện tư duy phân tích test case (trường hợp thường, biên, ngoại lệ)

Chương trình phân tích danh sách điểm số của học sinh (từ 0 đến 10), từ đó:
- Đếm số học sinh đạt loại **Giỏi**
- Tính **điểm trung bình hợp lệ**

---

## 2. Mô tả yêu cầu chức năng

### 2.1 Lớp `StudentAnalyzer`

Chương trình gồm lớp `StudentAnalyzer` với 2 phương thức chính:

#### `countExcellentStudents(List<Double> scores)`
- Đếm số học sinh đạt loại **Giỏi** (điểm ≥ 8.0)
- Bỏ qua các điểm **không hợp lệ** (nhỏ hơn 0 hoặc lớn hơn 10)
- Nếu danh sách rỗng hoặc không có điểm hợp lệ → trả về `0`

#### `calculateValidAverage(List<Double> scores)`
- Tính điểm trung bình **chỉ dựa trên các điểm hợp lệ (0–10)**
- Bỏ qua điểm không hợp lệ
- Nếu danh sách rỗng hoặc không có điểm hợp lệ → trả về `0`

---

## 3. Yêu cầu kỹ thuật

- Ngôn ngữ: **Java**
- Kiểm thử: **JUnit 5 (JUnit Jupiter)**
- Sử dụng vòng lặp `for` để:
  - Duyệt danh sách điểm
  - Lọc dữ liệu hợp lệ
  - Tính toán kết quả

---

## 4. Cấu trúc thư mục

```text
StudentAnalyzer/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── StudentAnalyzer.java
│   │
│   └── test/
│       └── java/
│           └── StudentAnalyzerTest.java
│
├── README.md

---

## 5. Cách chạy chương trình

### 5.1 Yêu cầu môi trường

- JDK 8 trở lên  
- IDE hỗ trợ Java (IntelliJ IDEA / Eclipse / VS Code)  
- JUnit 5 đã được cấu hình trong project  

### 5.2 Chạy chương trình

- Mở project bằng IDE  
- Kiểm tra file `StudentAnalyzer.java` trong thư mục `src/main/java`  
- Có thể gọi các phương thức từ một lớp `main` (nếu cần)  

---

## 6. Kiểm thử với JUnit

### 6.1 Mục tiêu kiểm thử

Viết test case cho từng phương thức theo 3 nhóm:

- Trường hợp bình thường  
- Trường hợp biên  
- Trường hợp ngoại lệ  

### 6.2 Các trường hợp kiểm thử chính

#### Đối với `countExcellentStudents`

- Danh sách có điểm hợp lệ và không hợp lệ  
- Danh sách toàn bộ hợp lệ  
- Danh sách rỗng  
- Danh sách chỉ chứa 0 và 10  
- Danh sách toàn bộ điểm không hợp lệ  

#### Đối với `calculateValidAverage`

- Danh sách có cả điểm hợp lệ và không hợp lệ  
- Danh sách toàn bộ hợp lệ  
- Danh sách rỗng  
- Danh sách chỉ chứa 0 và 10  
- Danh sách toàn bộ điểm không hợp lệ  

### 6.3 Cách chạy test

- Mở file `StudentAnalyzerTest.java`  
- Chuột phải → **Run 'StudentAnalyzerTest'**  
- Hoặc chạy toàn bộ test bằng công cụ của IDE  

Nếu tất cả test **PASS (màu xanh)** → chương trình hoạt động đúng.