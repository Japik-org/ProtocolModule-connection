package com.pro100kryto.server.modules.protocollitenetlib.connection;


import com.pro100kryto.server.module.IModuleConnection;
import com.pro100kryto.server.modules.protocollitenetlib.connection.exceptions.AProtocolException;
import com.pro100kryto.server.utils.datagram.packets.IPacketInProcess;

public interface IProtocolModuleConnection extends IModuleConnection {
    IPacketInProcess processPacketOnReceive(IPacketInProcess packet) throws AProtocolException;
    IPacketInProcess processPacketOnSend(IPacketInProcess packet) throws AProtocolException;
}
