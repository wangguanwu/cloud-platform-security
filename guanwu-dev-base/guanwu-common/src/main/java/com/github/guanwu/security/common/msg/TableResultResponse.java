package com.github.guanwu.security.common.msg;


import java.util.List;

public class TableResultResponse<T> extends BaseResponse {

    private  TableList<T> data;
    public TableResultResponse() {
        this.data = new TableList<T>();
    }

    public TableResultResponse(long total, List<T> data) {
        this.data = new TableList<T>(total, data);
    }

    class TableList<T> {
        long total;
        List<T> rows;

        public TableList() {
        }

        public TableList(long total, List<T> rows) {
            this.total = total;
            this.rows = rows;
        }

        public long getTotal() {
            return total;
        }

        public void setTotal(long total) {
            this.total = total;
        }

        public List<T> getRows() {
            return rows;
        }

        public void setRows(List<T> rows) {
            this.rows = rows;
        }
    }

    @Override
    public TableList<T> getData() {
        return data;
    }

    public void setData(TableList<T> data) {
        this.data = data;
    }
}
