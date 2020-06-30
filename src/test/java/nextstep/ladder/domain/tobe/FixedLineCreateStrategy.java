package nextstep.ladder.domain.tobe;

public class FixedLineCreateStrategy implements LineCreateStrategy {

    @Override
    public Direction first() {
        return Direction.CENTER;
    }

    @Override
    public Direction body(Direction exDirection) {
        return Direction.CENTER;
    }

    @Override
    public Direction last(Direction exDirection) {
        return Direction.CENTER;
    }
}
