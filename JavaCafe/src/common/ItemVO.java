package common;

public class ItemVO {
	String item_No;
	String item;
	String category;
	int price;
	String link;
	String content;
	int like_It;
	String alt;
	String image;
	public String getItem_No() {
		return item_No;
	}
	public void setItem_No(String item_No) {
		this.item_No = item_No;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLike_It() {
		return like_It;
	}
	public void setLike_It(int like_It) {
		this.like_It = like_It;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "ItemVO [item_No=" + item_No + ", item=" + item + ", category=" + category + ", price=" + price
				+ ", link=" + link + ", content=" + content + ", like_It=" + like_It + ", alt=" + alt + ", image="
				+ image + ", getItem_No()=" + getItem_No() + ", getItem()=" + getItem() + ", getCategory()="
				+ getCategory() + ", getPrice()=" + getPrice() + ", getLink()=" + getLink() + ", getContent()="
				+ getContent() + ", getLike_It()=" + getLike_It() + ", getAlt()=" + getAlt() + ", getImage()="
				+ getImage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
