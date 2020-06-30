package nextstep.ladder.domain.tobe.fixture;

import nextstep.ladder.domain.tobe.Direction;
import nextstep.ladder.domain.tobe.LineCreateStrategy;

import java.util.Arrays;
import java.util.List;

public class FixedLineCreateStrategy implements LineCreateStrategy {

    /*
    |-----|     |-----|
    |     |-----|     |
    |-----|     |     |
    |     |-----|     |
    |-----|     |-----|
     */
    private List<Direction> cachedDirection = Arrays.asList(
            Direction.RIGHT, Direction.LEFT, Direction.RIGHT, Direction.LEFT,
            Direction.CENTER, Direction.RIGHT, Direction.LEFT, Direction.CENTER,
            Direction.RIGHT, Direction.LEFT, Direction.CENTER, Direction.CENTER,
            Direction.CENTER, Direction.RIGHT, Direction.LEFT, Direction.CENTER,
            Direction.RIGHT, Direction.LEFT, Direction.RIGHT, Direction.LEFT
    );
    private int index = 0;

    @Override
    public Direction first() {
        return cachedDirection.get(index++);
    }

    @Override
    public Direction body(Direction exDirection) {
        return cachedDirection.get(index++);
    }

    @Override
    public Direction last(Direction exDirection) {
        return cachedDirection.get(index++);
    }
}
