package com.example.chisu.newssalad.token;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

//remix와 web3j 커맨드 툴로 만든 스마트 컨트랙트의 자바 wrapper 클래스.
//래퍼 클래스의 메소드를 쓰면 스마트 컨트랙트와 통신할 수 있다.

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.0.1.
 */
public class T5 extends Contract {
    public static final String BINARY = "{"
            + "\"object\": \"60606040526002805460ff19166012179055341561001c57600080fd5b604051610b9c380380610b9c8339810160405280805182019190602001805190910190505b60025460ff16600a0a61271002600381905533600160a060020a031660009081526004602052604081209190915582805161008092916020019061009d565b50600181805161009492916020019061009d565b505b505061013d565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100de57805160ff191683800117855561010b565b8280016001018555821561010b579182015b8281111561010b5782518255916020019190600101906100f0565b5b5061011892915061011c565b5090565b61013a91905b808211156101185760008155600101610122565b5090565b90565b610a508061014c6000396000f300606060405236156100b75763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166306fdde0381146100bc578063095ea7b31461014757806318160ddd1461017d57806323b872dd146101a2578063313ce567146101de57806342966c681461020757806370a082311461023157806379cc67901461026257806395d89b4114610298578063a9059cbb14610323578063cae9ca5114610359578063dd62ed3e146103d2575b600080fd5b34156100c757600080fd5b6100cf610409565b60405160208082528190810183818151815260200191508051906020019080838360005b8381101561010c5780820151818401525b6020016100f3565b50505050905090810190601f1680156101395780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561015257600080fd5b610169600160a060020a03600435166024356104a7565b604051901515815260200160405180910390f35b341561018857600080fd5b610190610514565b60405190815260200160405180910390f35b34156101ad57600080fd5b610169600160a060020a036004358116906024351660443561051a565b604051901515815260200160405180910390f35b34156101e957600080fd5b6101f1610592565b60405160ff909116815260200160405180910390f35b341561021257600080fd5b61016960043561059b565b604051901515815260200160405180910390f35b341561023c57600080fd5b610190600160a060020a0360043516610627565b60405190815260200160405180910390f35b341561026d57600080fd5b610169600160a060020a0360043516602435610639565b604051901515815260200160405180910390f35b34156102a357600080fd5b6100cf610716565b60405160208082528190810183818151815260200191508051906020019080838360005b8381101561010c5780820151818401525b6020016100f3565b50505050905090810190601f1680156101395780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561032e57600080fd5b610169600160a060020a03600435166024356107b4565b604051901515815260200160405180910390f35b341561036457600080fd5b61016960048035600160a060020a03169060248035919060649060443590810190830135806020601f820181900481020160405190810160405281815292919060208401838380828437509496506107cb95505050505050565b604051901515815260200160405180910390f35b34156103dd57600080fd5b610190600160a060020a03600435811690602435166108ff565b60405190815260200160405180910390f35b60008054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561049f5780601f106104745761010080835404028352916020019161049f565b820191906000526020600020905b81548152906001019060200180831161048257829003601f168201915b505050505081565b600160a060020a03338116600081815260056020908152604080832094871680845294909152808220859055909291907f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b9259085905190815260200160405180910390a35060015b92915050565b60035481565b600160a060020a0380841660009081526005602090815260408083203390941683529290529081205482111561054f57600080fd5b600160a060020a038085166000908152600560209081526040808320339094168352929052208054839003905561058784848461091c565b5060015b9392505050565b60025460ff1681565b600160a060020a033316600090815260046020526040812054829010156105c157600080fd5b600160a060020a03331660008181526004602052604090819020805485900390556003805485900390557fcc16f5dbb4873280815c1ee09dbd06736cffcc184412cf7a71a0fdb75d397ca59084905190815260200160405180910390a25060015b919050565b60046020526000908152604090205481565b600160a060020a0382166000908152600460205260408120548290101561065f57600080fd5b600160a060020a038084166000908152600560209081526040808320339094168352929052205482111561069257600080fd5b600160a060020a038084166000818152600460209081526040808320805488900390556005825280832033909516835293905282902080548590039055600380548590039055907fcc16f5dbb4873280815c1ee09dbd06736cffcc184412cf7a71a0fdb75d397ca59084905190815260200160405180910390a25060015b92915050565b60018054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561049f5780601f106104745761010080835404028352916020019161049f565b820191906000526020600020905b81548152906001019060200180831161048257829003601f168201915b505050505081565b60006107c133848461091c565b5060015b92915050565b6000836107d881856104a7565b156108f65780600160a060020a0316638f4ffcb1338630876040518563ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004018085600160a060020a0316600160a060020a0316815260200184815260200183600160a060020a0316600160a060020a0316815260200180602001828103825283818151815260200191508051906020019080838360005b8381101561088f5780820151818401525b602001610876565b50505050905090810190601f1680156108bc5780820380516001836020036101000a031916815260200191505b5095505050505050600060405180830381600087803b15156108dd57600080fd5b6102c65a03f115156108ee57600080fd5b505050600191505b5b509392505050565b600560209081526000928352604080842090915290825290205481565b6000600160a060020a038316151561093357600080fd5b600160a060020a0384166000908152600460205260409020548290101561095957600080fd5b600160a060020a038316600090815260046020526040902054828101101561098057600080fd5b50600160a060020a0380831660008181526004602052604080822080549488168084528284208054888103909155938590528154870190915591909301927fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef9085905190815260200160405180910390a3600160a060020a03808416600090815260046020526040808220549287168252902054018114610a1d57fe5b5b505050505600a165627a7a72305820a20a3c2e33f30450fa083d98fca8d5ea1f5ac7039f19bcaf10645f95fed96ad10029\","
            + "}";

//    public static final String BINARY = "{\n"
//            + "\t\"object\": \"60606040526002805460ff19166012179055341561001c57600080fd5b604051610b9c380380610b9c8339810160405280805182019190602001805190910190505b60025460ff16600a0a61271002600381905533600160a060020a031660009081526004602052604081209190915582805161008092916020019061009d565b50600181805161009492916020019061009d565b505b505061013d565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100de57805160ff191683800117855561010b565b8280016001018555821561010b579182015b8281111561010b5782518255916020019190600101906100f0565b5b5061011892915061011c565b5090565b61013a91905b808211156101185760008155600101610122565b5090565b90565b610a508061014c6000396000f300606060405236156100b75763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166306fdde0381146100bc578063095ea7b31461014757806318160ddd1461017d57806323b872dd146101a2578063313ce567146101de57806342966c681461020757806370a082311461023157806379cc67901461026257806395d89b4114610298578063a9059cbb14610323578063cae9ca5114610359578063dd62ed3e146103d2575b600080fd5b34156100c757600080fd5b6100cf610409565b60405160208082528190810183818151815260200191508051906020019080838360005b8381101561010c5780820151818401525b6020016100f3565b50505050905090810190601f1680156101395780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561015257600080fd5b610169600160a060020a03600435166024356104a7565b604051901515815260200160405180910390f35b341561018857600080fd5b610190610514565b60405190815260200160405180910390f35b34156101ad57600080fd5b610169600160a060020a036004358116906024351660443561051a565b604051901515815260200160405180910390f35b34156101e957600080fd5b6101f1610592565b60405160ff909116815260200160405180910390f35b341561021257600080fd5b61016960043561059b565b604051901515815260200160405180910390f35b341561023c57600080fd5b610190600160a060020a0360043516610627565b60405190815260200160405180910390f35b341561026d57600080fd5b610169600160a060020a0360043516602435610639565b604051901515815260200160405180910390f35b34156102a357600080fd5b6100cf610716565b60405160208082528190810183818151815260200191508051906020019080838360005b8381101561010c5780820151818401525b6020016100f3565b50505050905090810190601f1680156101395780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561032e57600080fd5b610169600160a060020a03600435166024356107b4565b604051901515815260200160405180910390f35b341561036457600080fd5b61016960048035600160a060020a03169060248035919060649060443590810190830135806020601f820181900481020160405190810160405281815292919060208401838380828437509496506107cb95505050505050565b604051901515815260200160405180910390f35b34156103dd57600080fd5b610190600160a060020a03600435811690602435166108ff565b60405190815260200160405180910390f35b60008054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561049f5780601f106104745761010080835404028352916020019161049f565b820191906000526020600020905b81548152906001019060200180831161048257829003601f168201915b505050505081565b600160a060020a03338116600081815260056020908152604080832094871680845294909152808220859055909291907f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b9259085905190815260200160405180910390a35060015b92915050565b60035481565b600160a060020a0380841660009081526005602090815260408083203390941683529290529081205482111561054f57600080fd5b600160a060020a038085166000908152600560209081526040808320339094168352929052208054839003905561058784848461091c565b5060015b9392505050565b60025460ff1681565b600160a060020a033316600090815260046020526040812054829010156105c157600080fd5b600160a060020a03331660008181526004602052604090819020805485900390556003805485900390557fcc16f5dbb4873280815c1ee09dbd06736cffcc184412cf7a71a0fdb75d397ca59084905190815260200160405180910390a25060015b919050565b60046020526000908152604090205481565b600160a060020a0382166000908152600460205260408120548290101561065f57600080fd5b600160a060020a038084166000908152600560209081526040808320339094168352929052205482111561069257600080fd5b600160a060020a038084166000818152600460209081526040808320805488900390556005825280832033909516835293905282902080548590039055600380548590039055907fcc16f5dbb4873280815c1ee09dbd06736cffcc184412cf7a71a0fdb75d397ca59084905190815260200160405180910390a25060015b92915050565b60018054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561049f5780601f106104745761010080835404028352916020019161049f565b820191906000526020600020905b81548152906001019060200180831161048257829003601f168201915b505050505081565b60006107c133848461091c565b5060015b92915050565b6000836107d881856104a7565b156108f65780600160a060020a0316638f4ffcb1338630876040518563ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004018085600160a060020a0316600160a060020a0316815260200184815260200183600160a060020a0316600160a060020a0316815260200180602001828103825283818151815260200191508051906020019080838360005b8381101561088f5780820151818401525b602001610876565b50505050905090810190601f1680156108bc5780820380516001836020036101000a031916815260200191505b5095505050505050600060405180830381600087803b15156108dd57600080fd5b6102c65a03f115156108ee57600080fd5b505050600191505b5b509392505050565b600560209081526000928352604080842090915290825290205481565b6000600160a060020a038316151561093357600080fd5b600160a060020a0384166000908152600460205260409020548290101561095957600080fd5b600160a060020a038316600090815260046020526040902054828101101561098057600080fd5b50600160a060020a0380831660008181526004602052604080822080549488168084528284208054888103909155938590528154870190915591909301927fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef9085905190815260200160405180910390a3600160a060020a03808416600090815260046020526040808220549287168252902054018114610a1d57fe5b5b505050505600a165627a7a72305820a20a3c2e33f30450fa083d98fca8d5ea1f5ac7039f19bcaf10645f95fed96ad10029\",\n"
//            + "}\n";


    public static final String FUNC_NAME = "name";

    public static final String FUNC_APPROVE = "approve";

    public static final String FUNC_TOTALSUPPLY = "totalSupply";

    public static final String FUNC_TRANSFERFROM = "transferFrom";

    public static final String FUNC_DECIMALS = "decimals";

    public static final String FUNC_BURN = "burn";

    public static final String FUNC_BALANCEOF = "balanceOf";

    public static final String FUNC_BURNFROM = "burnFrom";

    public static final String FUNC_SYMBOL = "symbol";

    public static final String FUNC_TRANSFER = "transfer";

    public static final String FUNC_APPROVEANDCALL = "approveAndCall";

    public static final String FUNC_ALLOWANCE = "allowance";

    @Deprecated
    public T5(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }


    @Deprecated
    public T5(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<String> name() {
        final Function function = new Function(FUNC_NAME,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> approve(String _spender, BigInteger _value) {
        final Function function = new Function(
                FUNC_APPROVE,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_spender),
                        new org.web3j.abi.datatypes.generated.Uint256(_value)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> totalSupply() {
        final Function function = new Function(FUNC_TOTALSUPPLY,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> transferFrom(String _from, String _to, BigInteger _value) {
        final Function function = new Function(
                FUNC_TRANSFERFROM,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from),
                        new org.web3j.abi.datatypes.Address(_to),
                        new org.web3j.abi.datatypes.generated.Uint256(_value)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> decimals() {
        final Function function = new Function(FUNC_DECIMALS,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> burn(BigInteger _value) {
        final Function function = new Function(
                FUNC_BURN,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_value)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> balanceOf(String param0) {
        final Function function = new Function
                (FUNC_BALANCEOF,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> burnFrom(String _from, BigInteger _value) {
        final Function function = new Function(
                FUNC_BURNFROM,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from),
                        new org.web3j.abi.datatypes.generated.Uint256(_value)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> symbol() {
        final Function function = new Function(FUNC_SYMBOL,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> transfer(String _to, BigInteger _value) {
        final Function function = new Function(
                FUNC_TRANSFER,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to),
                        new org.web3j.abi.datatypes.generated.Uint256(_value)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> approveAndCall(String _spender, BigInteger _value, byte[] _extraData) {
        final Function function = new Function(
                FUNC_APPROVEANDCALL,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_spender),
                        new org.web3j.abi.datatypes.generated.Uint256(_value),
                        new org.web3j.abi.datatypes.DynamicBytes(_extraData)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> allowance(String param0, String param1) {
        final Function function = new Function(FUNC_ALLOWANCE,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0),
                        new org.web3j.abi.datatypes.Address(param1)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

//    @Deprecated
    public static T5 load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new T5(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    //컨트랙트와 통신하기 위해 로드하는 함수.
//    @Deprecated
    public static T5 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new T5(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    @Deprecated
    public static RemoteCall<T5> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String tokenName, String tokenSymbol) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(tokenName),
                new org.web3j.abi.datatypes.Utf8String(tokenSymbol)));
        return deployRemoteCall(T5.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<T5> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String tokenName, String tokenSymbol) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(tokenName),
                new org.web3j.abi.datatypes.Utf8String(tokenSymbol)));
        return deployRemoteCall(T5.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static class TransferEventResponse {
        public Log log;

        public String from;

        public String to;

        public BigInteger value;
    }

    public static class ApprovalEventResponse {
        public Log log;

        public String _owner;

        public String _spender;

        public BigInteger _value;
    }

    public static class BurnEventResponse {
        public Log log;

        public String from;

        public BigInteger value;
    }
}