package wijmo.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import wijmo.BasicApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { BasicApplication.class })
public class CucumberSpingConfiguration {}
