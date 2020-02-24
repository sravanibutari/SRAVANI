import {Calculator} from './calculator';
describe('testing calculator class',function(){
it('test add function',function(){
let cal=new Calculator();
let actualResult=cal.addNumbers(10,20);
let expectedResult=30;
expect(actualResult).toBe(expectedResult)
})
it('test sub number',function(){
    const cal=new Calculator();
    let actualResult=cal.subNumbers(20,10);
    expect(actualResult).toBe(10);
})
})


