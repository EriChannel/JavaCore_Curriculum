## Máy ảo java

Máy ảo java (Java virtual machine - JVM) được dùng để thực thi các chương trình Java hay hiểu nôm na là trình thông dịch của Java. Nó cung cấp môi trường để code Java có thể thực thi được.
Mỗi nền tảng/hệ điều hành khác nhau (windows, linux, IOS,...) lại có một loại JVM khác nhau được cài đặt. Nói Java đa nền tảng, thực chất thì nó được hỗ trợ JVM trên nhiều nền tảng. Chương trình Java chạy được trên các hệ điều hành khác nhau vì nó có JVM chạy được trên các nền tảng đó, vì vậy mới hiểu ý nghĩa của câu _Viết một lần, chạy khắp mọi nơi_ là do JVM này thực hiện.
Ngôn ngữ dành cho máy ảo Java được gọi là Java bytecode, hay ngắn gọn là bytecode


![](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/c79vgbc51co14cjunu70)

### JVM thực hiện các công việc sau:

- Tải code
- Kiểm tra code (Kiểm tra code có đúng cú pháp không, có bị lỗi không)
- Thực thi code
- Cung cấp môi trường runtime
-
### Các thành phần của JVM

- **Classloader**: Tìm kiếm và load các file `*.class` vào vùng nhớ của Java dưới dạng bytecode
- **Data Area**: Vùng nhớ hệ thống cấp phát cho JVM
- **Excution Engine**: Chuyển các lệnh của JVM trong file `*.class` thành các lệnh của máy , hệ điều hành tương ứng và thực thi chúng.

## Phân biệt JDK, JVM và JRE

**JVM - Java Virtual Machine** là thành phần nền tảng Java thực thi các chương trình của bạn. Nó có 2 chức năng chính: Cho phép các chương trình Java chạy trên mọi thiết bị hoặc hệ điều hành và quản lý và tối ưu hóa bộ nhớ chương trình.

**JRE - Java Runtime Environment** khởi tạo JVM và đảm bảo các phụ thuộc có sẵn cho chương trình của bạn. JRE chứa các thư viện lớp Java, trình tải lớp Java và JVM. Nó chịu trách nhiệm tải chính xác các lớp và kết nối chúng với các thư viện lớp Java cốt lõi.

**JDK - Java Development Kit** là một thành phần nền tảng chính để xây dụng các ứng dụng Java. Trái tim của nó là trình biên dịch Java. JRE có thể được sử dụng như một thành phần độc lập để chạy các chương trình Java, nhưng nó cũng la một thành phần của JDK. JDK yêu cầy JRE vì chạy các chương trình Java là một phần của việc phát triển chúng.