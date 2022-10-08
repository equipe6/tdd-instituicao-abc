package br.edu.unisinos.instituicaoabc;

import lombok.AccessLevel;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Serializable;

@SpringBootApplication
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class InstituicaoAbcApplication implements Serializable {

    private static final long serialVersionUID = 1L;

    @Generated
    public static void main(String[] args) {
        showAppVersionInfo();
        SpringApplication.run(InstituicaoAbcApplication.class, args);
    }

    @Generated
    static void showAppVersionInfo() {
        Logger logger = LoggerFactory.getLogger(InstituicaoAbcApplication.class);
        logger.info("");
        logger.info("########################################################################################");
        logger.info("## |  java.version  |   " + System.getProperty("java.version"));
        logger.info("## |  java.home     |   " + System.getProperty("java.home"));
        logger.info("## |  java.vendor   |   " + System.getProperty("java.vendor"));
        logger.info("## |  os.arch       |   " + System.getProperty("os.arch"));
        logger.info("## |  os.name       |   " + System.getProperty("os.name"));
        logger.info("## |  os.version    |   " + System.getProperty("os.version"));
        logger.info("## |  spring-boot   |   " + SpringBootApplication.class.getPackage().getImplementationVersion());
        logger.info("########################################################################################");
        logger.info("");
    }

}