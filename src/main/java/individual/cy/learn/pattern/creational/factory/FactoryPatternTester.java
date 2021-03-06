package individual.cy.learn.pattern.creational.factory;

/**
 * @author mystic
 */
public class FactoryPatternTester {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // Acquire Circle
        Shape circle = factory.getShape(ShapeFactory.ShapeEnum.CIRCLE);
        circle.draw();

        // Acquire Rectangle
        Shape rectangle = factory.getShape(ShapeFactory.ShapeEnum.RECTANGLE);
        rectangle.draw();

        // Acquire Square
        Shape square = factory.getShape(ShapeFactory.ShapeEnum.SQUARE);
        square.draw();

        System.out.println();

        ShapeCreator.CIRCLE.getInstance().draw();
        ShapeCreator.RECTANGLE.getInstance().draw();
        ShapeCreator.SQUARE.getInstance().draw();

        System.out.println();

        System.out.println(ShapeCreator.CIRCLE.getInstance());
        System.out.println(ShapeCreator.CIRCLE.getInstance());
        System.out.println(ShapeCreator.CIRCLE.getInstance());
        // Or this usage
        System.out.println(ShapeCreator.getShape(ShapeCreator.CIRCLE));
        System.out.println(ShapeCreator.getShape(ShapeCreator.CIRCLE));
        System.out.println(ShapeCreator.getShape(ShapeCreator.CIRCLE));

        System.out.println();

        System.out.println(ShapeCreator2.CIRCLE.getShape());
        System.out.println(ShapeCreator2.CIRCLE.getShape());
        System.out.println(ShapeCreator2.CIRCLE.getShape());

    }
}
