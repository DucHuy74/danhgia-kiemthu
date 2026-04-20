# 📄 Báo Cáo Kiểm Thử (Black-Box Testing)

Dự án này áp dụng phương pháp **Kiểm thử hộp đen (Black-box Testing)** để thiết kế và thực thi các ca kiểm thử (Test Cases) cho các bài toán cơ bản.

---

## 🔹 1. Danh sách Test Case

### 1. Chu vi hình chữ nhật
| a | b | Expected | Type |
|---|---|----------|------|
| 2 | 3 | 10 | Valid |
| 1 | 1 | 4 | Boundary |
| 0 | 2 | Error | Invalid |
| -1| 2 | Error | Invalid |

### 2. Diện tích hình chữ nhật
| a | b | Expected | Type |
|---|---|----------|------|
| 2 | 3 | 6 | Valid |
| 1 | 1 | 1 | Boundary |
| 0 | 2 | Error | Invalid |
| -1| 2 | Error | Invalid |

### 3. Phương trình bậc 2 ($ax^2 + bx + c = 0$)
| a | b | c | Expected | Type |
|---|---|---|----------|------|
| 1 | -3| 2 | 2 nghiệm | Valid |
| 1 | 2 | 1 | 1 nghiệm | Boundary |
| 1 | 0 | 1 | No solution | Valid |
| 0 | 2 | -4| x = 2 | Boundary |
| 0 | 0 | 1 | No solution | Invalid |

### 4. Số ngày trong tháng
| month | year | Expected | Type |
|-------|------|----------|------|
| 1 | 2024 | 31 | Valid |
| 4 | 2024 | 30 | Valid |
| 2 | 2024 | 29 | Boundary |
| 2 | 2023 | 28 | Valid |
| 0 | 2024 | Error | Invalid |
| 13| 2024 | Error | Invalid |

### 5. Kiểm tra số nguyên tố
| n | Expected | Type |
|---|----------|------|
| 2 | true | Valid |
| 4 | false | Valid |
| 1 | false | Boundary |
| -5| false | Invalid |

### 6. Tổng S = 1 - 2 + ... + n
| n | Expected | Type |
|---|----------|------|
| 1 | 1 | Boundary |
| 2 | -1 | Valid |
| 3 | 2 | Valid |
| 0 | Error | Invalid |
| -1| Error | Invalid |

### 7. Ước chung lớn nhất (GCD)
| a | b | Expected | Type |
|---|---|----------|------|
| 6 | 8 | 2 | Valid |
| 10| 5 | 5 | Valid |
| 0 | 5 | 5 | Boundary |
| -1| 5 | Error | Invalid |
| -5| -10| Error | Invalid |

### 8. Tổng S = 1! + ... + n!
| n | Expected | Type |
|---|----------|------|
| 1 | 1 | Boundary |
| 2 | 3 | Valid |
| 3 | 9 | Valid |
| 0 | Error | Invalid |
| -1| Error | Invalid |

---

## 🔹 2. Kết quả chạy kiểm thử

Sau khi chạy toàn bộ test suit, hệ thống trả về kết quả như sau:

> **Tests run:** 16  
> **Failures:** 0  
> **Errors:** 0  
> **=> All tests passed successfully! **

---

## 🔹 3. Mô tả áp dụng kiểm thử hộp đen

### ✔ Phương pháp sử dụng
Trong dự án này, hai kỹ thuật kiểm thử hộp đen chính được áp dụng:

1. **Equivalence Partitioning (Phân lớp tương đương):**
   * Chia input thành các nhóm: **Hợp lệ (valid)** và **Không hợp lệ (invalid)**.
   * Mỗi nhóm chọn 1–2 giá trị đại diện để test nhằm giảm thiểu số lượng test case nhưng vẫn đảm bảo độ bao phủ.
2. **Boundary Value Analysis (Phân tích giá trị biên):**
   * Kiểm tra các giá trị ngay tại biên (ví dụ: 0, 1,...).
   * Kiểm tra các giá trị ngay ngoài biên (-1, hoặc các giá trị vượt giới hạn cho phép).

### ✔ Áp dụng cho từng bài toán

* **1 & 2. Hình chữ nhật (Chu vi, Diện tích)**
  * **Valid:** `a > 0`, `b > 0`
  * **Boundary:** `a = 1`, `b = 1`
  * **Invalid:** `a ≤ 0` hoặc `b ≤ 0`
* **3. Phương trình bậc 2**
  * **Valid:** $\Delta > 0$ (2 nghiệm phân biệt), $\Delta = 0$ (1 nghiệm kép), $\Delta < 0$ (vô nghiệm)
  * **Boundary:** `a = 0` (Trở thành phương trình bậc 1)
  * **Invalid:** `a = 0` và `b = 0`
* **4. Ngày trong tháng**
  * **Valid:** Tháng từ `1` đến `12`
  * **Boundary:** Tháng `2` (Kiểm tra năm nhuận và năm không nhuận)
  * **Invalid:** Tháng `< 1` hoặc `> 12`
* **5. Số nguyên tố**
  * **Valid:** `n ≥ 2`
  * **Boundary:** `n = 1` (Không phải số nguyên tố)
  * **Invalid:** `n < 0`
* **6. Tổng luân phiên (S = 1 - 2 + ... + n)**
  * **Valid:** `n > 0`
  * **Boundary:** `n = 1`
  * **Invalid:** `n ≤ 0`
* **7. Ước chung lớn nhất (GCD)**
  * **Valid:** `a ≥ 0`, `b ≥ 0`
  * **Boundary:** `a = 0` hoặc `b = 0`
  * **Invalid:** `a < 0` hoặc `b < 0`
* **8. Tổng giai thừa (S = 1! + ... + n!)**
  * **Valid:** `n ≥ 1`
  * **Boundary:** `n = 1`
  * **Invalid:** `n ≤ 0`
