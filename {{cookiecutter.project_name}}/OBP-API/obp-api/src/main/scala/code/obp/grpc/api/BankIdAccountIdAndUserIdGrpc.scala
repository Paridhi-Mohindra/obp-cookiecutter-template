// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package code.obp.grpc.api

@SerialVersionUID(0L)
final case class BankIdAccountIdAndUserIdGrpc(
    bankId: _root_.scala.Predef.String = "",
    accountId: _root_.scala.Predef.String = "",
    userId: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[BankIdAccountIdAndUserIdGrpc] with scalapb.lenses.Updatable[BankIdAccountIdAndUserIdGrpc] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (bankId != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, bankId) }
      if (accountId != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, accountId) }
      if (userId != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, userId) }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = bankId
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = accountId
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = userId
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): code.obp.grpc.api.BankIdAccountIdAndUserIdGrpc = {
      var __bankId = this.bankId
      var __accountId = this.accountId
      var __userId = this.userId
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __bankId = _input__.readString()
          case 18 =>
            __accountId = _input__.readString()
          case 26 =>
            __userId = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      code.obp.grpc.api.BankIdAccountIdAndUserIdGrpc(
          bankId = __bankId,
          accountId = __accountId,
          userId = __userId
      )
    }
    def withBankId(__v: _root_.scala.Predef.String): BankIdAccountIdAndUserIdGrpc = copy(bankId = __v)
    def withAccountId(__v: _root_.scala.Predef.String): BankIdAccountIdAndUserIdGrpc = copy(accountId = __v)
    def withUserId(__v: _root_.scala.Predef.String): BankIdAccountIdAndUserIdGrpc = copy(userId = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = bankId
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = accountId
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = userId
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(bankId)
        case 2 => _root_.scalapb.descriptors.PString(accountId)
        case 3 => _root_.scalapb.descriptors.PString(userId)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = code.obp.grpc.api.BankIdAccountIdAndUserIdGrpc
}

object BankIdAccountIdAndUserIdGrpc extends scalapb.GeneratedMessageCompanion[code.obp.grpc.api.BankIdAccountIdAndUserIdGrpc] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[code.obp.grpc.api.BankIdAccountIdAndUserIdGrpc] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): code.obp.grpc.api.BankIdAccountIdAndUserIdGrpc = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    code.obp.grpc.api.BankIdAccountIdAndUserIdGrpc(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[code.obp.grpc.api.BankIdAccountIdAndUserIdGrpc] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      code.obp.grpc.api.BankIdAccountIdAndUserIdGrpc(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ApiProto.javaDescriptor.getMessageTypes.get(12)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ApiProto.scalaDescriptor.messages(12)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = code.obp.grpc.api.BankIdAccountIdAndUserIdGrpc(
  )
  implicit class BankIdAccountIdAndUserIdGrpcLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, code.obp.grpc.api.BankIdAccountIdAndUserIdGrpc]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, code.obp.grpc.api.BankIdAccountIdAndUserIdGrpc](_l) {
    def bankId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.bankId)((c_, f_) => c_.copy(bankId = f_))
    def accountId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.accountId)((c_, f_) => c_.copy(accountId = f_))
    def userId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.userId)((c_, f_) => c_.copy(userId = f_))
  }
  final val BANKID_FIELD_NUMBER = 1
  final val ACCOUNTID_FIELD_NUMBER = 2
  final val USERID_FIELD_NUMBER = 3
}
