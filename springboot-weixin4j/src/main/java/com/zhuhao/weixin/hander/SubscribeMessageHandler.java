package com.zhuhao.weixin.hander;

import com.foxinmy.weixin4j.handler.MessageHandlerAdapter;
import com.foxinmy.weixin4j.mp.event.ScribeEventMessage;
import com.foxinmy.weixin4j.request.WeixinRequest;
import com.foxinmy.weixin4j.response.TextResponse;
import com.foxinmy.weixin4j.response.WeixinResponse;
import org.springframework.stereotype.Component;

/**
 * 处理关注消息
 *
 * @author jinyu(foxinmy @ gmail.com)
 * @className SubscribeMessageHandler
 * @date 2015年12月3日
 * @since JDK 1.6
 */
@Component
public class SubscribeMessageHandler extends MessageHandlerAdapter<ScribeEventMessage> {

    @Override
    public WeixinResponse doHandle0(WeixinRequest request, ScribeEventMessage message) {
        System.out.println(request);
        return new TextResponse("欢迎关注～");
    }
}
