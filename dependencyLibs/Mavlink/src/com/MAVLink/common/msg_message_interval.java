/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MESSAGE_INTERVAL PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
* This interface replaces DATA_STREAM
*/
public class msg_message_interval extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_MESSAGE_INTERVAL = 244;
    public static final int MAVLINK_MSG_LENGTH = 6;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MESSAGE_INTERVAL;


    
    /**
    * The interval between two messages, in microseconds. A value of -1 indicates this stream is disabled, 0 indicates it is not available, > 0 indicates the interval at which it is sent.
    */
    public int interval_us;
    
    /**
    * The ID of the requested MAVLink message. v1.0 is limited to 254 messages.
    */
    public int message_id;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_MESSAGE_INTERVAL;
        
        packet.payload.putInt(interval_us);
        
        packet.payload.putUnsignedShort(message_id);
        
        return packet;
    }

    /**
    * Decode a message_interval message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.interval_us = payload.getInt();
        
        this.message_id = payload.getUnsignedShort();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_message_interval(){
        msgid = MAVLINK_MSG_ID_MESSAGE_INTERVAL;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_message_interval(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_MESSAGE_INTERVAL;
        unpack(mavLinkPacket.payload);
    }

        
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_MESSAGE_INTERVAL -"+" interval_us:"+interval_us+" message_id:"+message_id+"";
    }
}
        