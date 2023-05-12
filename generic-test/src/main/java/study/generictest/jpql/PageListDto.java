package study.generictest.jpql;

import java.util.List;

public class PageListDto<T> {

    private List<T> pageList;

    public PageListDto(List<T> pageList) {
        this.pageList = pageList;
    }

    public List<T> getPageList() {
        return pageList;
    }

    public void setPageList(List<T> pageList) {
        this.pageList = pageList;
    }
}
