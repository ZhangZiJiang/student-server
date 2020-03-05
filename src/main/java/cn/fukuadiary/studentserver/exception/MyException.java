package cn.fukuadiary.studentserver.exception;


import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName MyException
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/5
 * @Version 1.0
 **/
@Slf4j
public class MyException extends Throwable {

    public MyException(String errorCode) {

        super(errorCode, new Throwable());
        log.error("can not null");
    }

}
