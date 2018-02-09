
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class CEPListener implements UpdateListener {

    @Override
    public void update(EventBean[] ebs, EventBean[] ebs1) {
        System.out.println("Event received: " + ebs[0].getEventType().getName() + " "
                + ebs[0].getUnderlying());

    }
}
