package nextstep.ladder.domain.tobe;

public interface LineCreateStrategy {
    public Direction first();

    public Direction body(Direction exDirection);

    public Direction last(Direction exDirection);
}
