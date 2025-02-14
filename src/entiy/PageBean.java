package entiy;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: 分页对象
 * User: GAOBO
 * Date: 2020-07-15
 * Time: 18:44
 */
public class PageBean<T> {
    private int totalCount;   //总记录数
    private int totalPage; //总页码
    private List<T> list;  //每页中的数据
    private int currentPage;  //当前页码
    private int rows;   //每页的记录数

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
