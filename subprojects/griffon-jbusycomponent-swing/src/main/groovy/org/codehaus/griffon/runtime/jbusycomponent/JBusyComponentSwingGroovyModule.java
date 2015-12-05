package org.codehaus.griffon.runtime.jbusycomponent;

import griffon.builder.swing.JBusyComponentSwingBuilderCustomizer;
import griffon.core.injection.Module;
import griffon.inject.DependsOn;
import griffon.util.BuilderCustomizer;
import org.codehaus.griffon.runtime.core.injection.AbstractModule;
import org.kordamp.jipsy.ServiceProviderFor;

import javax.inject.Named;

@DependsOn("swing-groovy")
@Named("jbusycomponent-swing-groovy")
@ServiceProviderFor(Module.class)
public class JBusyComponentSwingGroovyModule extends AbstractModule {
  @Override
  protected void doConfigure() {
    bind(BuilderCustomizer.class)
        .to(JBusyComponentSwingBuilderCustomizer.class)
        .asSingleton();
  }
}
