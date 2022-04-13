package com.shuang.commons.multi.shardingjdbc.service;

import com.shuang.commons.multi.shardingjdbc.bean.PerpetualCoin;
import java.util.List;

public interface PerpetualCoinService {


    PerpetualCoin getPerpetualCoinById(Long id);

    List<PerpetualCoin> getPerpetualCoinList();

    int savePerpetualCoin(PerpetualCoin perpetualCoin);

    int updatePerpetualCoin(PerpetualCoin perpetualCoin);

    int deletePerpetualCoin(Long id);

    int transactionPerpetualCoin(PerpetualCoin perpetualCoin,Long id);

}