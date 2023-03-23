package org.example.Injects;

import org.example.Config.ApplicationConfig;
import org.example.bean.Leaf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class ConstructorInject {
    @Component
    public class ConstructorLeaf {
        private Leaf leaf;
        @Autowired
        public ConstructorLeaf(Leaf leaf) {
            this.leaf = leaf;
        }
    }
}
