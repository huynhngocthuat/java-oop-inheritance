# java-oop-inheritance
Tạo một chương trình bảng điều khiển Java để quản lý nhân viên trong trường đại học.
Bối cảnh nền
Viết chương trình quản lý thông tin của nhân viên. Chương trình triển khai thuật ngữ của
Mô hình lập trình hướng đối tượng (OOP). OOP là một trong những cách lựa chọn tốt nhất để thiết kế
chương trình phần mềm.
Trong thử nghiệm này, chúng tôi sẽ sử dụng ArrayList để lưu trữ danh sách nhân viên. Trên thực tế, ArrayList được sử dụng phổ biến để
thao tác với dữ liệu. ArrayList cung cấp một số phương thức hữu ích, chẳng hạn như: add (), remove (), sort ().,
Vân vân.
Đặc điểm chương trình
Tất cả nhân viên đều có các thuộc tính chung: id, tên, điện thoại, email, hệ số lương (float) và
loại nhân viên.
Có hai giá trị của loại nhân viên:
- 1: dành cho giảng viên
- 2: dành cho Cán bộ
Tuy nhiên, mỗi loại nhân viên có thêm các thuộc tính khác nhau:
- Giảng viên: phụ cấp giờ dạy (float)
- Cán bộ: phòng, ban, phụ cấp văn phòng (float)
1. Màn hình chính như bên dưới:
CHÀO MỪNG CÁC BẠN ĐẾN VỚI QUẢN LÝ NHÂN VIÊN
1. Tạo
2. Xem tất cả thông tin nhân viên
3. Xem thông tin của nhân viên có tổng mức lương cao nhất
4. Thoát
2. Chi tiết chức năng:
Có 3 chức năng trong Màn hình Quản lý Nhân viên, như sau:
1. Viết hàm để người dùng tạo nhân viên và lưu trữ trong ArrayList: Người dùng tạo nhân viên
bằng cách nhập thông tin từ bàn phím. Yêu cầu người dùng chọn loại nhân viên cho
tạo: chọn 1 để tạo giảng viên, 2 để tạo viên chức. Sau khi người dùng nhập nhân viên
thông tin, chương trình hiển thị thông báo "Bạn có muốn tiếp tục (Y / N) không?" Chọn Y
để tiếp tục tạo nhân viên với loại nhân viên đã chọn, N để quay lại màn hình chính.
 Yêu cầu để xác nhận:
 Chương trình phải kiểm tra dữ liệu hợp lệ cho:
• Điện thoại: là số có tối thiểu 10 ký tự
• Email: với định dạng <tên tài khoản> @ <tên miền>. (ví dụ: annguyen@fpt.edu.vn)
2. Viết hàm để người dùng xem tất cả thông tin của nhân viên: Chương trình hiển thị
thông tin của nhân viên theo loại nhân viên.
Ví dụ:
======== LECTURER ======
L1 | John Smith | 0912345678 | johnsmith@gmail.com | 3,33 | 15000000,00
======== NHÂN VIÊN ======
O1 | Richard | 0987654345 | richard@gmail.com | 3,66 | NÓ | 400000,00
3. Viết hàm để người dùng xem thông tin của nhân viên có tổng lương cao nhất.
Tổng lương = (lương hệ số * 1650000) + phụ cấp giờ dạy (nếu có) + văn phòng
phụ cấp (nếu có)
Giao diện kỳ ​​vọng
Thực đơn:
1. Tạo nhân viên
2.Xem tất cả thông tin nhân viên
3.Xem thông tin của nhân viên có tổng mức lương cao nhất
Điểm phân phối:
Không. Điểm chức năng
1 Tạo nhân viên và lưu trữ trong Danh sách mảng 4
2 Xem tất cả thông tin của nhân viên 4
3 Xem thông tin của nhân viên có tổng số cao nhất
tiền lương
2
