
## 1. Cấu hình Cache
Đã thêm `cache: 'maven'` vào `actions/setup-java@v4` trong file `.github/workflows/ci.yml`.

## 2. So sánh thời gian
| Lần chạy | Cache | Thời gian | Ghi chú |
| :--- | :--- | :--- | :--- |
| Lần 1 | Không | 45s | Tải từ Maven Central |
| Lần 2 | Có | 20s | Lấy từ GitHub Cache |

## 3. Phân tích Log
- **Lần 1:** Log báo `Cache not found`, tải thư viện từ `central`, cuối job báo `Cache saved successfully`.
- **Lần 2:** Log báo `Cache restored successfully`, không tải thư viện từ `central` nữa.

## 4. Kết luận
Cache giúp giảm thời gian build và tiết kiệm tài nguyên.