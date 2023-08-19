package hello.itemservice.domain.item;

import lombok.Data;

@Data // 원래는 위험하다 그냥 예제니까 하자
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
