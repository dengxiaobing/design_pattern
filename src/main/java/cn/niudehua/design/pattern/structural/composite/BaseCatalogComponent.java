package cn.niudehua.design.pattern.structural.composite;

/**
 * @author: deng
 * @datetime: 2020/7/4 12:11 上午
 * @desc:
 */
public abstract class BaseCatalogComponent {
    public void add(BaseCatalogComponent baseCatalogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(BaseCatalogComponent baseCatalogComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(BaseCatalogComponent baseCatalogComponent) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(BaseCatalogComponent baseCatalogComponent) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
