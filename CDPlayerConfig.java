package chp02.autowiring.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * @ComponentScan("chp02.autowiring")也可以写成：
 * @ComponentScan(basePackages="chp02.autowiring");
 * @ComponentScan(basePackages={"chp02.autowiring"});
 * 或者，更进一步用basePackageClasses定义某些类所在的包作为扫描包
 * @ComponentScan(basePackageClasses={CDPlayer.class, DVDPlayer.class});
 * pitianyue
 */
@Configuration
@ComponentScan("chp02.autowiring")
public class CDPlayerConfig { 
}
