// Generated by ProtoGen, Version=2.4.1.555, Culture=neutral, PublicKeyToken=55f7125234beb589.  DO NOT EDIT!
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.ProtocolBuffers;
using pbc = global::Google.ProtocolBuffers.Collections;
using pbd = global::Google.ProtocolBuffers.Descriptors;
using scg = global::System.Collections.Generic;
namespace Proto {
  
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
  public static partial class PbDecodeRequest {
  
    #region Extension registration
    public static void RegisterAllExtensions(pb::ExtensionRegistry registry) {
    }
    #endregion
    #region Static variables
    internal static pbd::MessageDescriptor internal__static_PbDecodeRequest__Descriptor;
    internal static pb::FieldAccess.FieldAccessorTable<global::PbDecodeRequest, global::PbDecodeRequest.Builder> internal__static_PbDecodeRequest__FieldAccessorTable;
    #endregion
    #region Descriptor
    public static pbd::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbd::FileDescriptor descriptor;
    
    static PbDecodeRequest() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "Chxwcm90b3MvUGJEZWNvZGVSZXF1ZXN0LnByb3RvImMKD1BiRGVjb2RlUmVx", 
            "dWVzdBIMCgRJTUVJGAEgAigJEg8KB0RlY29kZXMYAiADKAwSEAoITGF0aXR1", 
          "ZGUYAyABKAESEQoJTG9uZ2l0dWRlGAQgASgBEgwKBGNvZGUYBSABKAk="));
      pbd::FileDescriptor.InternalDescriptorAssigner assigner = delegate(pbd::FileDescriptor root) {
        descriptor = root;
        internal__static_PbDecodeRequest__Descriptor = Descriptor.MessageTypes[0];
        internal__static_PbDecodeRequest__FieldAccessorTable = 
            new pb::FieldAccess.FieldAccessorTable<global::PbDecodeRequest, global::PbDecodeRequest.Builder>(internal__static_PbDecodeRequest__Descriptor,
                new string[] { "IMEI", "Decodes", "Latitude", "Longitude", "Code", });
        return null;
      };
      pbd::FileDescriptor.InternalBuildGeneratedFileFrom(descriptorData,
          new pbd::FileDescriptor[] {
          }, assigner);
    }
    #endregion
    
  }
}
#region Messages
[global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
public sealed partial class PbDecodeRequest : pb::GeneratedMessage<PbDecodeRequest, PbDecodeRequest.Builder> {
  private PbDecodeRequest() { }
  private static readonly PbDecodeRequest defaultInstance = new PbDecodeRequest().MakeReadOnly();
  private static readonly string[] _pbDecodeRequestFieldNames = new string[] { "Decodes", "IMEI", "Latitude", "Longitude", "code" };
  private static readonly uint[] _pbDecodeRequestFieldTags = new uint[] { 18, 10, 25, 33, 42 };
  public static PbDecodeRequest DefaultInstance {
    get { return defaultInstance; }
  }
  
  public override PbDecodeRequest DefaultInstanceForType {
    get { return DefaultInstance; }
  }
  
  protected override PbDecodeRequest ThisMessage {
    get { return this; }
  }
  
  public static pbd::MessageDescriptor Descriptor {
    get { return global::Proto.PbDecodeRequest.internal__static_PbDecodeRequest__Descriptor; }
  }
  
  protected override pb::FieldAccess.FieldAccessorTable<PbDecodeRequest, PbDecodeRequest.Builder> InternalFieldAccessors {
    get { return global::Proto.PbDecodeRequest.internal__static_PbDecodeRequest__FieldAccessorTable; }
  }
  
  public const int IMEIFieldNumber = 1;
  private bool hasIMEI;
  private string iMEI_ = "";
  public bool HasIMEI {
    get { return hasIMEI; }
  }
  public string IMEI {
    get { return iMEI_; }
  }
  
  public const int DecodesFieldNumber = 2;
  private pbc::PopsicleList<pb::ByteString> decodes_ = new pbc::PopsicleList<pb::ByteString>();
  public scg::IList<pb::ByteString> DecodesList {
    get { return pbc::Lists.AsReadOnly(decodes_); }
  }
  public int DecodesCount {
    get { return decodes_.Count; }
  }
  public pb::ByteString GetDecodes(int index) {
    return decodes_[index];
  }
  
  public const int LatitudeFieldNumber = 3;
  private bool hasLatitude;
  private double latitude_;
  public bool HasLatitude {
    get { return hasLatitude; }
  }
  public double Latitude {
    get { return latitude_; }
  }
  
  public const int LongitudeFieldNumber = 4;
  private bool hasLongitude;
  private double longitude_;
  public bool HasLongitude {
    get { return hasLongitude; }
  }
  public double Longitude {
    get { return longitude_; }
  }
  
  public const int CodeFieldNumber = 5;
  private bool hasCode;
  private string code_ = "";
  public bool HasCode {
    get { return hasCode; }
  }
  public string Code {
    get { return code_; }
  }
  
  public override bool IsInitialized {
    get {
      if (!hasIMEI) return false;
      return true;
    }
  }
  
  public override void WriteTo(pb::ICodedOutputStream output) {
    CalcSerializedSize();
    string[] field_names = _pbDecodeRequestFieldNames;
    if (hasIMEI) {
      output.WriteString(1, field_names[1], IMEI);
    }
    if (decodes_.Count > 0) {
      output.WriteBytesArray(2, field_names[0], decodes_);
    }
    if (hasLatitude) {
      output.WriteDouble(3, field_names[2], Latitude);
    }
    if (hasLongitude) {
      output.WriteDouble(4, field_names[3], Longitude);
    }
    if (hasCode) {
      output.WriteString(5, field_names[4], Code);
    }
    UnknownFields.WriteTo(output);
  }
  
  private int memoizedSerializedSize = -1;
  public override int SerializedSize {
    get {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
      return CalcSerializedSize();
    }
  }
  
  private int CalcSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;
    
    size = 0;
    if (hasIMEI) {
      size += pb::CodedOutputStream.ComputeStringSize(1, IMEI);
    }
    {
      int dataSize = 0;
      foreach (pb::ByteString element in DecodesList) {
        dataSize += pb::CodedOutputStream.ComputeBytesSizeNoTag(element);
      }
      size += dataSize;
      size += 1 * decodes_.Count;
    }
    if (hasLatitude) {
      size += pb::CodedOutputStream.ComputeDoubleSize(3, Latitude);
    }
    if (hasLongitude) {
      size += pb::CodedOutputStream.ComputeDoubleSize(4, Longitude);
    }
    if (hasCode) {
      size += pb::CodedOutputStream.ComputeStringSize(5, Code);
    }
    size += UnknownFields.SerializedSize;
    memoizedSerializedSize = size;
    return size;
  }
  public static PbDecodeRequest ParseFrom(pb::ByteString data) {
    return ((Builder) CreateBuilder().MergeFrom(data)).BuildParsed();
  }
  public static PbDecodeRequest ParseFrom(pb::ByteString data, pb::ExtensionRegistry extensionRegistry) {
    return ((Builder) CreateBuilder().MergeFrom(data, extensionRegistry)).BuildParsed();
  }
  public static PbDecodeRequest ParseFrom(byte[] data) {
    return ((Builder) CreateBuilder().MergeFrom(data)).BuildParsed();
  }
  public static PbDecodeRequest ParseFrom(byte[] data, pb::ExtensionRegistry extensionRegistry) {
    return ((Builder) CreateBuilder().MergeFrom(data, extensionRegistry)).BuildParsed();
  }
  public static PbDecodeRequest ParseFrom(global::System.IO.Stream input) {
    return ((Builder) CreateBuilder().MergeFrom(input)).BuildParsed();
  }
  public static PbDecodeRequest ParseFrom(global::System.IO.Stream input, pb::ExtensionRegistry extensionRegistry) {
    return ((Builder) CreateBuilder().MergeFrom(input, extensionRegistry)).BuildParsed();
  }
  public static PbDecodeRequest ParseDelimitedFrom(global::System.IO.Stream input) {
    return CreateBuilder().MergeDelimitedFrom(input).BuildParsed();
  }
  public static PbDecodeRequest ParseDelimitedFrom(global::System.IO.Stream input, pb::ExtensionRegistry extensionRegistry) {
    return CreateBuilder().MergeDelimitedFrom(input, extensionRegistry).BuildParsed();
  }
  public static PbDecodeRequest ParseFrom(pb::ICodedInputStream input) {
    return ((Builder) CreateBuilder().MergeFrom(input)).BuildParsed();
  }
  public static PbDecodeRequest ParseFrom(pb::ICodedInputStream input, pb::ExtensionRegistry extensionRegistry) {
    return ((Builder) CreateBuilder().MergeFrom(input, extensionRegistry)).BuildParsed();
  }
  private PbDecodeRequest MakeReadOnly() {
    decodes_.MakeReadOnly();
    return this;
  }
  
  public static Builder CreateBuilder() { return new Builder(); }
  public override Builder ToBuilder() { return CreateBuilder(this); }
  public override Builder CreateBuilderForType() { return new Builder(); }
  public static Builder CreateBuilder(PbDecodeRequest prototype) {
    return new Builder(prototype);
  }
  
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
  public sealed partial class Builder : pb::GeneratedBuilder<PbDecodeRequest, Builder> {
    protected override Builder ThisBuilder {
      get { return this; }
    }
    public Builder() {
      result = DefaultInstance;
      resultIsReadOnly = true;
    }
    internal Builder(PbDecodeRequest cloneFrom) {
      result = cloneFrom;
      resultIsReadOnly = true;
    }
    
    private bool resultIsReadOnly;
    private PbDecodeRequest result;
    
    private PbDecodeRequest PrepareBuilder() {
      if (resultIsReadOnly) {
        PbDecodeRequest original = result;
        result = new PbDecodeRequest();
        resultIsReadOnly = false;
        MergeFrom(original);
      }
      return result;
    }
    
    public override bool IsInitialized {
      get { return result.IsInitialized; }
    }
    
    protected override PbDecodeRequest MessageBeingBuilt {
      get { return PrepareBuilder(); }
    }
    
    public override Builder Clear() {
      result = DefaultInstance;
      resultIsReadOnly = true;
      return this;
    }
    
    public override Builder Clone() {
      if (resultIsReadOnly) {
        return new Builder(result);
      } else {
        return new Builder().MergeFrom(result);
      }
    }
    
    public override pbd::MessageDescriptor DescriptorForType {
      get { return global::PbDecodeRequest.Descriptor; }
    }
    
    public override PbDecodeRequest DefaultInstanceForType {
      get { return global::PbDecodeRequest.DefaultInstance; }
    }
    
    public override PbDecodeRequest BuildPartial() {
      if (resultIsReadOnly) {
        return result;
      }
      resultIsReadOnly = true;
      return result.MakeReadOnly();
    }
    
    public override Builder MergeFrom(pb::IMessage other) {
      if (other is PbDecodeRequest) {
        return MergeFrom((PbDecodeRequest) other);
      } else {
        base.MergeFrom(other);
        return this;
      }
    }
    
    public override Builder MergeFrom(PbDecodeRequest other) {
      if (other == global::PbDecodeRequest.DefaultInstance) return this;
      PrepareBuilder();
      if (other.HasIMEI) {
        IMEI = other.IMEI;
      }
      if (other.decodes_.Count != 0) {
        result.decodes_.Add(other.decodes_);
      }
      if (other.HasLatitude) {
        Latitude = other.Latitude;
      }
      if (other.HasLongitude) {
        Longitude = other.Longitude;
      }
      if (other.HasCode) {
        Code = other.Code;
      }
      this.MergeUnknownFields(other.UnknownFields);
      return this;
    }
    
    public override Builder MergeFrom(pb::ICodedInputStream input) {
      return MergeFrom(input, pb::ExtensionRegistry.Empty);
    }
    
    public override Builder MergeFrom(pb::ICodedInputStream input, pb::ExtensionRegistry extensionRegistry) {
      PrepareBuilder();
      pb::UnknownFieldSet.Builder unknownFields = null;
      uint tag;
      string field_name;
      while (input.ReadTag(out tag, out field_name)) {
        if(tag == 0 && field_name != null) {
          int field_ordinal = global::System.Array.BinarySearch(_pbDecodeRequestFieldNames, field_name, global::System.StringComparer.Ordinal);
          if(field_ordinal >= 0)
            tag = _pbDecodeRequestFieldTags[field_ordinal];
          else {
            if (unknownFields == null) {
              unknownFields = pb::UnknownFieldSet.CreateBuilder(this.UnknownFields);
            }
            ParseUnknownField(input, unknownFields, extensionRegistry, tag, field_name);
            continue;
          }
        }
        switch (tag) {
          case 0: {
            throw pb::InvalidProtocolBufferException.InvalidTag();
          }
          default: {
            if (pb::WireFormat.IsEndGroupTag(tag)) {
              if (unknownFields != null) {
                this.UnknownFields = unknownFields.Build();
              }
              return this;
            }
            if (unknownFields == null) {
              unknownFields = pb::UnknownFieldSet.CreateBuilder(this.UnknownFields);
            }
            ParseUnknownField(input, unknownFields, extensionRegistry, tag, field_name);
            break;
          }
          case 10: {
            result.hasIMEI = input.ReadString(ref result.iMEI_);
            break;
          }
          case 18: {
            input.ReadBytesArray(tag, field_name, result.decodes_);
            break;
          }
          case 25: {
            result.hasLatitude = input.ReadDouble(ref result.latitude_);
            break;
          }
          case 33: {
            result.hasLongitude = input.ReadDouble(ref result.longitude_);
            break;
          }
          case 42: {
            result.hasCode = input.ReadString(ref result.code_);
            break;
          }
        }
      }
      
      if (unknownFields != null) {
        this.UnknownFields = unknownFields.Build();
      }
      return this;
    }
    
    
    public bool HasIMEI {
      get { return result.hasIMEI; }
    }
    public string IMEI {
      get { return result.IMEI; }
      set { SetIMEI(value); }
    }
    public Builder SetIMEI(string value) {
      pb::ThrowHelper.ThrowIfNull(value, "value");
      PrepareBuilder();
      result.hasIMEI = true;
      result.iMEI_ = value;
      return this;
    }
    public Builder ClearIMEI() {
      PrepareBuilder();
      result.hasIMEI = false;
      result.iMEI_ = "";
      return this;
    }
    
    public pbc::IPopsicleList<pb::ByteString> DecodesList {
      get { return PrepareBuilder().decodes_; }
    }
    public int DecodesCount {
      get { return result.DecodesCount; }
    }
    public pb::ByteString GetDecodes(int index) {
      return result.GetDecodes(index);
    }
    public Builder SetDecodes(int index, pb::ByteString value) {
      pb::ThrowHelper.ThrowIfNull(value, "value");
      PrepareBuilder();
      result.decodes_[index] = value;
      return this;
    }
    public Builder AddDecodes(pb::ByteString value) {
      pb::ThrowHelper.ThrowIfNull(value, "value");
      PrepareBuilder();
      result.decodes_.Add(value);
      return this;
    }
    public Builder AddRangeDecodes(scg::IEnumerable<pb::ByteString> values) {
      PrepareBuilder();
      result.decodes_.Add(values);
      return this;
    }
    public Builder ClearDecodes() {
      PrepareBuilder();
      result.decodes_.Clear();
      return this;
    }
    
    public bool HasLatitude {
      get { return result.hasLatitude; }
    }
    public double Latitude {
      get { return result.Latitude; }
      set { SetLatitude(value); }
    }
    public Builder SetLatitude(double value) {
      PrepareBuilder();
      result.hasLatitude = true;
      result.latitude_ = value;
      return this;
    }
    public Builder ClearLatitude() {
      PrepareBuilder();
      result.hasLatitude = false;
      result.latitude_ = 0D;
      return this;
    }
    
    public bool HasLongitude {
      get { return result.hasLongitude; }
    }
    public double Longitude {
      get { return result.Longitude; }
      set { SetLongitude(value); }
    }
    public Builder SetLongitude(double value) {
      PrepareBuilder();
      result.hasLongitude = true;
      result.longitude_ = value;
      return this;
    }
    public Builder ClearLongitude() {
      PrepareBuilder();
      result.hasLongitude = false;
      result.longitude_ = 0D;
      return this;
    }
    
    public bool HasCode {
      get { return result.hasCode; }
    }
    public string Code {
      get { return result.Code; }
      set { SetCode(value); }
    }
    public Builder SetCode(string value) {
      pb::ThrowHelper.ThrowIfNull(value, "value");
      PrepareBuilder();
      result.hasCode = true;
      result.code_ = value;
      return this;
    }
    public Builder ClearCode() {
      PrepareBuilder();
      result.hasCode = false;
      result.code_ = "";
      return this;
    }
  }
  static PbDecodeRequest() {
    object.ReferenceEquals(global::Proto.PbDecodeRequest.Descriptor, null);
  }
}

#endregion


#endregion Designer generated code