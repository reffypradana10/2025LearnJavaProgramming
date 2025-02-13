package Bagian3.programmer.zaman.now.application;

import Bagian3.programmer.zaman.now.data.Category;

public class CategoryAdd {
    public static void main(String[] args) {
        var category = new Category();

        category.setId("ID");
        category.setId(null);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());



    }

}
