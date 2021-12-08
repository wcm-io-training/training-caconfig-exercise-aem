package de.provision.training.caconfig.aem.config;

import org.apache.sling.caconfig.annotation.Configuration;

/**
 * Link list
 */
@Configuration(collection = true)
public @interface LinkList {

  /**
   * @return Link name
   */
  String name();

  /**
   * @return Page path for internal link
   */
  String pagePath();

}
