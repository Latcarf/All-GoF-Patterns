package Patterns.BehavioralPatterns.Interpreter;

public class SubtractExpression implements Expression {
    private Expression firstExpression, secondExpression;

    public SubtractExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return firstExpression.interpret() - secondExpression.interpret();
    }
}
