import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import model.Hello;

public class Handler implements RequestHandler<Hello, Hello> {

    public Hello handleRequest(Hello i, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("LambdaLogger in handleRequest Method");
        logger.log("Received Hello message:" + i.getMessage());
        Hello h = new Hello();
        h.setMessage("Hello world!");
        return h;
    }
}
