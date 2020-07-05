package cn.niudehua.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: deng
 * @datetime: 2020/7/4 12:18 上午
 * @desc:
 */
public class CourseCatalog extends BaseCatalogComponent {
    private List<BaseCatalogComponent> items = new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(BaseCatalogComponent baseCatalogComponent) {
        items.add(baseCatalogComponent);
    }

    @Override
    public void remove(BaseCatalogComponent baseCatalogComponent) {
        items.remove(baseCatalogComponent);
    }

    @Override
    public String getName(BaseCatalogComponent baseCatalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (BaseCatalogComponent baseCatalogComponent : items) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("\t");
                }
            }
            baseCatalogComponent.print();
        }
    }
}
