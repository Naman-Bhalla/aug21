package designpatterns.strategy;

public class LFUPageReplacementStrategy implements PageReplacementStrategy, AddPageEventSubscriber {

    @Override
    public void replace() {

    }

    @Override
    public void onAddPage(Page page) {

    }
}


// Batch(batch_id) {
//   SqlQuey = "Selerct * from ..."
//   this.name = query.name;
//   this.nuStudents = query.nuStudents
// }
// clone (Batch b) {
//   Batch clone = new Bathc();

//
// }