package chp02.autowiring.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * @ComponentScan("chp02.autowiring")Ҳ����д�ɣ�
 * @ComponentScan(basePackages="chp02.autowiring");
 * @ComponentScan(basePackages={"chp02.autowiring"});
 * ���ߣ�����һ����basePackageClasses����ĳЩ�����ڵİ���Ϊɨ���
 * @ComponentScan(basePackageClasses={CDPlayer.class, DVDPlayer.class});
 */
@Configuration
@ComponentScan("chp02.autowiring")
public class CDPlayerConfig { 
}
