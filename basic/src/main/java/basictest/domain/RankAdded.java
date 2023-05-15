package basictest.domain;

import basictest.domain.*;
import basictest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RankAdded extends AbstractEvent {

    private Long id;
    private String name;

    public RankAdded(Rank aggregate) {
        super(aggregate);
    }

    public RankAdded() {
        super();
    }
}
