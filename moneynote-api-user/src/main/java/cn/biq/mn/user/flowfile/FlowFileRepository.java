package cn.biq.mn.user.flowfile;

import cn.biq.mn.base.base.BaseRepository;
import cn.biq.mn.user.balanceflow.BalanceFlow;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FlowFileRepository extends BaseRepository<FlowFile> {

    List<FlowFile> findByFlow(BalanceFlow flow);

}
