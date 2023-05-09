package wijmo.domain;

import java.util.*;
import lombok.*;
import wijmo.domain.*;
import wijmo.infra.AbstractEvent;

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
