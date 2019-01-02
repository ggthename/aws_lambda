package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloPojoTest {
    private HelloPojo object;
    private TestContext context;

    @BeforeEach
    public void setUp(){
        object = new HelloPojo();
        context = new TestContext();
    }

    @Test
    public void handleRequestTest(){
        RequestClass input = new RequestClass();
        input.setFirstName("Test");
        input.setLastName("Success");

        ResponseClass res = object.handleRequest(input,context);

        assertEquals("Hello Test, Success." , res.getGreetings());

    }
}
