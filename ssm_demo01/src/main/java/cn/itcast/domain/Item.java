package cn.itcast.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//`id` BIGINT (9),
//`name` VARCHAR (150),
//`price` DOUBLE ,
//`pic` VARCHAR (150),
//`createtime` TIMESTAMP ,
//`detail` VARCHAR (150)
public class Item{
private int id;
private String name;
private double price;
private String pic;
@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
private Date createtime;
private String detail;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getPic() {
	return pic;
}
public void setPic(String pic) {
	this.pic = pic;
}
public Date getCreatetime() {
	return createtime;
}
public void setCreatetime(Date createtime) {
	this.createtime = createtime;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
@Override
public String toString() {
	return "Item [id=" + id + ", name=" + name + ", price=" + price + ", pic=" + pic + ", createtime=" + createtime
			+ ", detail=" + detail + "]";
}

}
