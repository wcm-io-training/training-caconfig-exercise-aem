/* Copyright (c) pro!vision GmbH. All rights reserved. */
package de.provision.training.caconfig.aem.config;

import org.apache.sling.caconfig.annotation.Property;

/**
 * Shopping basket configuration.
 * This class has no configuration annotation because it's only used as nested configuration.
 */
public @interface ShoppingBasket {

  /**
   * @return Shopping basket visible or not.
   */
  @Property(label = "Visible", description = "Shopping basket visible or not.")
  boolean visible() default true;

  /**
   * @return Max. items in shopping basket.
   */
  @Property(label = "Max. items", description = "Max. items in shopping basket.")
  int maxItems() default 10;

}
