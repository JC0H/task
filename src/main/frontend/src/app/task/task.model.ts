export class Task{
    public id: number;
    public name: string;
    public color: string;
    public size: string;

    constructor(id:number, name:string, color:string, size:string){
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }
}
