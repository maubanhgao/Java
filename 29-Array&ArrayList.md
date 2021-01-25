# Phân biệt sự khác nhau giữa Array và ArrayList



| Array                                                     | ArrayList                                                    |
| --------------------------------------------------------- | ------------------------------------------------------------ |
| Có kích thước **cố định**                                 | Kích thước **có thể thay đổi được**. Nếu mặc định là 10. Khi vượt sức chứa thì danh sách tự động cho phép tăng 50% kích thước ban đầu (10 -> 15) |
| Có thể lưu **kiểu dữ liệu nguyên thủy** và **đối tượng**. | Chỉ có thể lưu được kiểu dữ liệu đối tượng. Kể từ Java 5 ,  kiểu dữ liệu nguyên thủy tự động chuyển đổi trong đối tượng được gọi là auto-boxing |
| Tốc độ lưu trữ và tốc độ thao tác nhanh hơn.              | Tốc độ lưu trữ và thao tác chậm hơn                          |
| Chỉ có duy nhất thuộc tính lenght                         | Có nhiều thuộc tính: add(), set(), size() ...                |

