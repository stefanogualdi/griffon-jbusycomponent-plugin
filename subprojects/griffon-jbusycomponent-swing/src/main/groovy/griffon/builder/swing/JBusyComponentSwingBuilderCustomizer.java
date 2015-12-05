package griffon.builder.swing;

import griffon.inject.DependsOn;

import griffon.builder.swing.factory.JBusyComponentFactory;
import groovy.swing.factory.BeanFactory;
import groovy.util.Factory;
import org.codehaus.griffon.runtime.groovy.view.AbstractBuilderCustomizer;
import org.divxdede.swing.busy.DefaultBusyModel;
import org.divxdede.swing.busy.FutureBusyModel;

import javax.inject.Named;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Stefano Gualdi
 */
@DependsOn("swing")
@Named("jbusycomponent-swing")
public class JBusyComponentSwingBuilderCustomizer extends AbstractBuilderCustomizer {
  public JBusyComponentSwingBuilderCustomizer() {
    Map<String, Factory> factories = new LinkedHashMap<String, Factory>();
    factories.put("busyComponent", new JBusyComponentFactory());
    factories.put("busyModel", new BeanFactory(DefaultBusyModel.class, true));
    factories.put("futureBusyModel", new BeanFactory(FutureBusyModel.class, true));
    setFactories(factories);
  }
}
