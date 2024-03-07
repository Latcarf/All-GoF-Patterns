package Patterns.BehavioralPatterns.Interpreter;

public class AddExpression implements Expression {
    private Expression firstExpression, secondExpression;

    public AddExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return firstExpression.interpret() + secondExpression.interpret();
    }
}
