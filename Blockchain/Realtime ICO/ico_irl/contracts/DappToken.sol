// SPDX-License-Identifier: MIT
pragma solidity >=0.5.0;

import "../node_modules/openzeppelin-solidity/contracts/token/ERC20/ERC20.sol";

contract DappToken is ERC20 {
    constructor(string _name, string _symbol, uint8 _decimals)
        ERC20(_name, _symbol, _decimals)
        public
        {
            
        }
}