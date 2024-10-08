public class Customer {
    // 定义顾客类中的各个属性
    private String id;       // 客户唯一标识符
    private String name;     // 姓名
    private String address;  // 地址
    private String email;    // 邮箱地址

    public Customer() {
    }

    private String phoneNumber; // 联系电话号码

    // 构造函数初始化成员变量
    public Customer(String id, String name, String address, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // 提供获取和设置每个私有成员变量的方法（getter 和 setter）
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // 方法：返回包含所有信息的一条消息
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Address: " + address +
                ", Email: " + email + ", Phone Number: " + phoneNumber;
    }
}