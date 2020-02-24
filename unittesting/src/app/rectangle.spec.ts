
import { Rectangle } from './rectangle';
describe('testing rectangle class',function(){
    it('test area function',function(){
        let rec=new Rectangle();
        let actualResult=rec.getArea(4,8);
        let expectedResult=32;
        expect(actualResult).toBe(expectedResult)
        })
        it('test Perimeter number',function(){
            let rec=new Rectangle();
            let actualResult=rec.getPerimeter(2,1);
            let expectedResult=6;
            expect(actualResult).toBe(expectedResult);
        })
        })