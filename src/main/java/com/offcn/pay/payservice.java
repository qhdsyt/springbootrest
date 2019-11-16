package com.offcn.pay;

public interface payservice {

    public void wexinPay();

    public String queryPayStatue(String out_trade_no);
}
